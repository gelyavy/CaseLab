public class Task1 {
    String query = "SELECT surname FROM employees WHERE experience = (SELECT MAX(experience) FROM employees WHERE experience != (SELECT MAX(experience) FROM employees))";
}