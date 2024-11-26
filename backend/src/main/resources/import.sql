-- Inserindo departamentos

INSERT INTO tb_department (name, description, head_department) VALUES ('Recursos Humanos', 'Departamento responsável pela gestão de pessoas', 'Carlos Almeida');
INSERT INTO tb_department (name, description, head_department) VALUES ('Tecnologia', 'Departamento responsável pela infraestrutura de TI', 'Ana Souza');
INSERT INTO tb_department (name, description, head_department) VALUES ('Financeiro', 'Departamento responsável pelo controle financeiro', 'João Silva');
INSERT INTO tb_department (name, description, head_department) VALUES ('Marketing', 'Departamento responsável pela comunicação e promoção da empresa', 'Fernanda Costa');
INSERT INTO tb_department (name, description, head_department) VALUES ('Vendas', 'Departamento responsável pela estratégia de vendas e relacionamento com clientes', 'Ricardo Lima');

-- Inserindo cargos (job titles)

INSERT INTO tb_job_title (name, description, base_salary) VALUES ('Gerente de RH', 'Responsável pela gestão e desenvolvimento dos funcionários', 8000);
INSERT INTO tb_job_title (name, description, base_salary) VALUES ('Desenvolvedor Full Stack', 'Responsável pelo desenvolvimento de sistemas e manutenção de plataformas', 7000);
INSERT INTO tb_job_title (name, description, base_salary) VALUES ('Analista Financeiro', 'Responsável pelo controle de fluxo de caixa e relatórios financeiros', 6000);
INSERT INTO tb_job_title (name, description, base_salary) VALUES ('Coordenador de Marketing', 'Responsável por gerenciar as campanhas de marketing e publicidade', 7500);
INSERT INTO tb_job_title (name, description, base_salary) VALUES ('Representante de Vendas', 'Responsável pela prospecção de novos clientes e manutenção de contas', 5000);

-- Inserindo funcionários

INSERT INTO tb_employee (name, date_admission, salary, department_id, job_title_id) VALUES ('Gabriel leal', '2024-01-15', 4500.00, 1, 1);
INSERT INTO tb_employee (name, date_admission, salary, department_id, job_title_id) VALUES ('Maria', '2023-07-22', 7500.00, 2, 2);
INSERT INTO tb_employee (name, date_admission, salary, department_id, job_title_id) VALUES ('Fernanda Souza', '2022-11-10', 6000.00, 3, 3);
INSERT INTO tb_employee (name, date_admission, salary, department_id, job_title_id) VALUES ('Ricardo Lima', '2021-05-01', 5000.00, 4, 4);
INSERT INTO tb_employee (name, date_admission, salary, department_id, job_title_id) VALUES ('Juliana Costa', '2020-09-30', 4000.00, 5, 5);

-- Inserindo Roles

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_USER');

-- Inserindo usuários

INSERT INTO tb_user (email, password, sex, img_url, employee_id) VALUES ('gabriel.santos@gmail.com', '1234', 'Masculino', 'https://github.com/Gabriellealsantos/animes-img/blob/main/userimg/download%20(1).jpg', 1);
INSERT INTO tb_user (email, password, sex, img_url, employee_id) VALUES ('maria.santos@gmail.com', '1234', 'Feminino', 'https://github.com/Gabriellealsantos/animes-img/blob/main/userimg/download.jpg', 2);
INSERT INTO tb_user (email, password, sex, img_url, employee_id) VALUES ('fernanda.souza@gmail.com', '1234', 'Feminino','https://github.com/Gabriellealsantos/animes-img/blob/main/userimg/download.jpg', 3);
INSERT INTO tb_user (email, password, sex, img_url, employee_id) VALUES ('ricardo.lima@gmail.com', '1234', 'Masculino','https://github.com/Gabriellealsantos/animes-img/blob/main/userimg/download%20(1).jpg', 4);
INSERT INTO tb_user (email, password, sex, img_url, employee_id) VALUES ('juliana.costa@gmail.com', '1234', 'Feminino','https://github.com/Gabriellealsantos/animes-img/blob/main/userimg/download.jpg', 5);

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1); -- Gabriel Leal (ROLE_ADMIN)
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2); -- Maria Santos (ROLE_USER)
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2); -- Fernanda Souza (ROLE_USER)
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 2); -- Ricardo Lima (ROLE_USER)
INSERT INTO tb_user_role (user_id, role_id) VALUES (5, 2); -- Juliana Costa (ROLE_USER)

-- Inserindo registros de férias para os funcionários

INSERT INTO tb_vacation (start_date, end_date, employee_id, status) VALUES ('2024-07-01', '2024-07-15', 1, 'APPROVED');
INSERT INTO tb_vacation (start_date, end_date, employee_id, status) VALUES ('2023-12-01', '2023-12-15', 2, 'PENDING');
INSERT INTO tb_vacation (start_date, end_date, employee_id, status) VALUES ('2022-06-10', '2022-06-20', 3, 'APPROVED');
INSERT INTO tb_vacation (start_date, end_date, employee_id, status) VALUES ('2021-07-01', '2021-07-15', 4, 'REJECTED');
INSERT INTO tb_vacation (start_date, end_date, employee_id, status) VALUES ('2020-12-01', '2020-12-15', 5, 'APPROVED');

-- Inserindo documentos para os funcionários

INSERT INTO tb_document (document_name, document_url, employee_id, date_issuance)VALUES ('Contrato de Trabalho - Gabriel Leal', 'https://drive.google.com/file/d/1Fjept0KnYvYbq5XpF8LgKv9bJrKcdH5v/view?usp=sharing', 1, '2024-01-15');
INSERT INTO tb_document (document_name, document_url, employee_id, date_issuance) VALUES ('Contrato de Trabalho - Maria Santos', 'https://drive.google.com/file/d/1Z8Y0OtAkd_gkPR6XsqYnd6JY0tQsXzPU/view?usp=sharing', 2, '2023-07-22');
INSERT INTO tb_document (document_name, document_url, employee_id, date_issuance) VALUES ('Contrato de Trabalho - Fernanda Souza', 'https://drive.google.com/file/d/1w2N_lxx8yZgEXYH44Ez-wbcIuPfWvAFu/view?usp=sharing', 3, '2022-11-10');
INSERT INTO tb_document (document_name, document_url, employee_id, date_issuance) VALUES ('Contrato de Trabalho - Ricardo Lima', 'https://drive.google.com/file/d/1XpQYbbp5Pbvn9cN9RRA2k7fQrbAvnVzR/view?usp=sharing', 4, '2021-05-01');
INSERT INTO tb_document (document_name, document_url, employee_id, date_issuance) VALUES ('Contrato de Trabalho - Juliana Costa', 'https://drive.google.com/file/d/1w7gFJ8IswzFwQQdJ0S1wG25E7fvcLU5u/view?usp=sharing', 5, '2020-09-30');

-- Inserindo registros de trabalho para os funcionários

INSERT INTO tb_work_record (work_date, entry_time, exit_time, employee_id) VALUES ('2024-01-15', '08:00:00', '17:00:00', 1);

-- Inserindo registros de infração (fouls) para os registros de trabalho

INSERT INTO tb_foul (reason, description, work_record_id) VALUES ('LATE_ARRIVAL', 'Chegada atrasada', 1);













