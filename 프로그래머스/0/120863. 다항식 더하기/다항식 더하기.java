class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int coefficient = 0;//계수
        int constant = 0;//상수
        StringBuilder sb = new StringBuilder();
        
        String[] polyArr = polynomial.split(" ");
        for (int i = 0; i < polyArr.length; i += 2) {
            if (polyArr[i].contains("x")) {
                String temp = polyArr[i].replace("x", "").trim();
                coefficient += temp.equals("") ? 1 : Integer.parseInt(temp);
            } else if (!polyArr[i].contains("x")) {
                constant += Integer.parseInt(polyArr[i]);
            }
        }

        if (coefficient == 0) {
            answer = sb.append(constant).toString();
        } else if (coefficient == 1) {
            answer = sb.append(constant == 0 ? "x" : "x + " + constant).toString();
        } else if (constant == 0) {
            answer = sb.append(coefficient).append("x").toString();
        } else {
            answer = sb.append(coefficient).append("x + ").append(constant).toString();
        }
        
        return answer;
    }
}
