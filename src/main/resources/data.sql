INSERT INTO users (age,name,sur_name, password,email)
VALUES
    (22,'Ad','min', '$2a$12$XTaGGGFoxZsWpd.Tc/K1g.muEHnBBFP.ezfxrkRzdg.WArRNjbrQ6','kladmin@mail.ru'),
    (33,'Us','er',  '$2a$12$XTaGGGFoxZsWpd.Tc/K1g.muEHnBBFP.ezfxrkRzdg.WArRNjbrQ6','user@mail.ru');
insert into roles (name)
values
    ('ROLE_ADMIN'),('ROLE_USER');

insert into user_role (user_id, role_id)
values (1,1), (2,2), (1,2);

