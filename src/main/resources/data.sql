-- Admin 테이블에 데이터 삽입
INSERT INTO Admin (admin_id, admin_name) VALUES
(1, 'John Doe'),
(2, 'Jane Smith');

-- College 테이블에 데이터 삽입
INSERT INTO College (college_id, college_name) VALUES
 (1, 'Engineering'),
 (2, 'Science');

-- Department 테이블에 데이터 삽입
INSERT INTO Department (dept_id, dept_name, college_id) VALUES
(1, 'Computer Science', 1),
(2, 'Electrical Engineering', 1),
(3, 'Biology', 2),
(4, 'Chemistry', 2);

-- Classroom 테이블에 데이터 삽입
INSERT INTO Classroom (classroom_id, college_id) VALUES
 (1, 1),
 (2, 1),
 (3, 2),
 (4, 2);

-- Notice 테이블에 데이터 삽입
INSERT INTO Notice (notice_id, title, content, created_time) VALUES
(1, 'Important Announcement', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.', '2024-05-08 10:00:00'),
(2, 'Reminder', 'Nulla facilisi. Donec finibus semper ante, ac pulvinar tortor condimentum a.', '2024-05-07 15:30:00');

-- Professor 테이블에 데이터 삽입
INSERT INTO Professor (professor_id, professor_name, birth, gender, address, phone, dept_id, hire_date) VALUES
(1, 'John Smith', '1975-03-15', 'M', '123 Main St, City', '123-456-7890', 1, '2010-08-01'),
(2, 'Jane Doe', '1980-07-20', 'F', '456 Elm St, Town', '987-654-3210', 2, '2015-02-15');


-- Student 테이블에 데이터 삽입
INSERT INTO Student (student_id, student_name, birth, gender, address, phone, dept_id, academic_year, semester, entrance_date) VALUES
(1, 'Michael Johnson', '2000-01-10', 'M', '789 Oak St, Village', '456-789-0123', 1, 2022, 1, '2022-03-01'),
(2, 'Emily Wilson', '2001-05-20', 'F', '321 Pine St, Hamlet', '789-012-3456', 2, 2023, 2, '2023-01-15');


-- Subject 테이블에 데이터 삽입
INSERT INTO Subject (subject_id, subject_name, professor_id, classroom_id, subject_type, credit, academic_year, semester, day_of_week, start_time, end_time, max_student, total_student) VALUES
(1, 'Computer Science', 1, 1, 'major', 3, 2024, 1, 'Mon', '09:00:00', '11:00:00', 30, 25),
(2, 'Biology', 2, 3, 'general', 2, 2024, 1, 'Wed', '13:00:00', '15:00:00', 25, 20),
(3, 'Chemistry', 1, 2, 'general', 2, 2024, 1, 'Fri', '14:00:00', '16:00:00', 23, 23);

-- Users 테이블에 데이터 삽입
INSERT INTO Users (user_id, password, role) VALUES
(1, '1111', 'STUDENT'),
(2, '2222', 'STUDENT');

