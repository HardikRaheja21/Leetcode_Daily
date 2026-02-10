// Last updated: 2/10/2026, 3:16:31 PM
class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());

        int i = 0;
        int n = formula.length();

        while(i < n){
            char ch = formula.charAt(i);
            if(ch == '('){
                stack.push(new HashMap<>());
                i++;
            }
            else if(ch == ')'){
                i++;
                int multiplier = readNumber(formula, n, i);
                int digits = countDigits(formula, n, i);
                i += digits;

                Map<String, Integer> top = stack.pop();
                Map<String, Integer> prev = stack.peek();

                for(String atom : top.keySet()){
                    int val = top.get(atom) * multiplier;
                    prev.put(atom, prev.getOrDefault(atom, 0) + val);
                }
            }
            else{
                String atom = readAtom(formula, n, i);
                i += atom.length();
                int count = readNumber(formula, n, i);
                int digits = countDigits(formula, n, i);
                i += digits;

                Map<String, Integer> cur = stack.peek();
                cur.put(atom, cur.getOrDefault(atom, 0) + count);
            }
        }

        Map<String, Integer> map = stack.pop();
        TreeMap<String, Integer> sorted = new TreeMap<>(map);

        StringBuilder sb = new StringBuilder();
        for(String atom : sorted.keySet()){
            sb.append(atom);
            int cnt = sorted.get(atom);
            if(cnt > 1) sb.append(cnt);
        }
        return sb.toString();
    }

    private String readAtom(String s, int n, int i){
        StringBuilder atom = new StringBuilder();
        atom.append(s.charAt(i));
        i++;
        while(i < n && Character.isLowerCase(s.charAt(i))){
            atom.append(s.charAt(i));
            i++;
        }
        return atom.toString();
    }

    private int readNumber(String s, int n, int i){
        if(i >= n || !Character.isDigit(s.charAt(i))) return 1;

        int num = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        return num;
    }

    private int countDigits(String s, int n, int i){
        int cnt = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            cnt++;
            i++;
        }
        return cnt;
    }
}