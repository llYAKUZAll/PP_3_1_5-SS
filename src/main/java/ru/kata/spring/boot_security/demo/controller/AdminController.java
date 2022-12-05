package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;
import java.util.ArrayList;


@Controller
@RequestMapping("/admin")
public class AdminController {
    private final UserService userService;
    private final RoleService roleService;

    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping()
    public String getControlUsersPage(Model model, Principal principal, @AuthenticationPrincipal User user) {

        model.addAttribute("roleList", roleService.getAllRoles());
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("userByEmail", userService.getUserByLogin(principal.getName()));
        return "controller";
    }

    @PostMapping
    public String createUser(@ModelAttribute("user") User user, @RequestParam("userRole") ArrayList<Long> roles) {
        userService.createUser(user, roleService.findByIdRoles(roles));
        return "redirect:/admin";
    }

    @PutMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user, @RequestParam("userRole") ArrayList<Long> roles) {
        userService.updateUser(user, roleService.findByIdRoles(roles));
        return "redirect:/admin";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }
}
