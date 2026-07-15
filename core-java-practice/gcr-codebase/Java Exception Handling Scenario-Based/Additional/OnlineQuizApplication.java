/**
 * Online Quiz Application
 * Handles array index out of bounds exception
 * Continues checking remaining answers even if error occurs
 */

public class OnlineQuizApplication {
    private String[] answers;
    private String[] correctAnswers;
    
    public OnlineQuizApplication(String[] answers, String[] correctAnswers) {
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }
    
    // Check single answer - handles array out of bounds
    public boolean checkAnswer(int index) {
        try {
            if (index < 0 || index >= answers.length) {
                throw new IndexOutOfBoundsException("Question " + index + " does not exist. Total questions: " + answers.length);
            }
            
            if (index >= correctAnswers.length) {
                throw new IndexOutOfBoundsException("Correct answer for question " + index + " not available");
            }
            
            boolean result = answers[index].equals(correctAnswers[index]);
            System.out.println("Q" + (index + 1) + ": " + answers[index] + " -> " + (result ? "CORRECT" : "WRONG"));
            return result;
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR Q" + (index + 1) + ": " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("ERROR Q" + (index + 1) + ": " + e.getMessage());
            return false;
        }
    }
    
    // Check all answers - continues even if errors occur
    public int evaluateQuiz() {
        int correct = 0;
        System.out.println("=== Evaluating Quiz ===");
        
        for (int i = 0; i < 6; i++) {
            try {
                if (checkAnswer(i)) {
                    correct++;
                }
            } catch (Exception e) {
                System.out.println("Skipping Q" + (i + 1) + ": " + e.getMessage());
            }
        }
        
        System.out.println("Score: " + correct + "/4");
        return correct;
    }
    
    public static void main(String[] args) {
        String[] studentAnswers = {"A", "B", "C", "D"};
        String[] correctAnswers = {"A", "B", "A", "D"};
        
        OnlineQuizApplication quiz = new OnlineQuizApplication(studentAnswers, correctAnswers);
        
        // Test: Accessing invalid index (5) when only 4 answers exist
        System.out.println("Student answers: {A, B, C, D}\n");
        
        // Individual checks - including out of bounds
        System.out.println("[Test 1] Check valid questions:");
        quiz.checkAnswer(0);
        quiz.checkAnswer(1);
        quiz.checkAnswer(2);
        quiz.checkAnswer(3);
        
        System.out.println("\n[Test 2] Check invalid index (5):");
        quiz.checkAnswer(5);
        
        System.out.println("\n[Test 3] Evaluate entire quiz (continues despite errors):");
        quiz.evaluateQuiz();
    }
}
