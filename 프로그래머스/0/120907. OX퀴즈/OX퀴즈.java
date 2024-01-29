class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            int result = 0;
            String[] equation = quiz[i].split(" ");
            for (int j = 0; j < equation.length; j += 3) {
                if (equation[j + 1].equals("+")) {
                    result = Integer.parseInt(equation[j]) + Integer.parseInt(equation[j + 2]);
                } else if (equation[j + 1].equals("-")) {
                    result = Integer.parseInt(equation[j]) - Integer.parseInt(equation[j + 2]);
                }
                
                if (result == Integer.parseInt(equation[equation.length - 1])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}
