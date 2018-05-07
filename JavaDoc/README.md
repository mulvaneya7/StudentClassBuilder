# StudentClassBuilder

Your task is to create a course registration system. Students can register for a certain number of
courses. Each course is taught by one faculty member. Each faculty member can teach a certain
number of courses.
The system stores the first, middle, and last name of everyone who attends the university
(students and faculty members), along with the email, telephone number, street address, city,
state, and zip code. There is also a unique id number that is assigned by the system when the
student or faculty member is first entered into the system.
For each student, the system also tracks the date of birth, current GPA, and the date the
student started attending the university.
For each faculty, the system tracks the hire date and whether the faculty member is tenured.
Courses belong to a department (e.g. CS or BIO), have a code (e.g. 1A, 4A, or 4B), and a
description (e.g. Introduction to Computer Science). The course id uniquely defines a course
and is simply a combination of the department and code (e.g. CS1A or BIO1B). Each course has
minimum and maximum number of students per session. If there are not enough students to fill
a session, that session is cancelled. If no sessions for a course are scheduled, the entire course
is cancelled.
For each course you can have multiple sessions. A session has a unique id (e.g. c123486). Each
session id is system generated and must be unique across all sessions.
Each course has a minimum and maximum number of students who can enroll. If a course does
not meet the minimum number of students, it will be cancelled.
Your solution should be built to be as flexible and dynamic as possible. You should create a way
to swap scheduling algorithms during runtime. For example, maybe one of your scheduling
algorithm runs through all sessions and students and fills sessions sequentially. You do not have
to define multiple scheduling algorithms, but your code must be written to allow someone else
to use your code, define a new algorithm at run time, and use that algorithm at run time. In
your report, you must document how you were able to achieve this.
You must also create a flexible way to change the algorithm with how unique ids are
determined (i.e. for student/faculty ids and for session ids). You should create a separate
algorithm for student/faculty ids and for session ids.
