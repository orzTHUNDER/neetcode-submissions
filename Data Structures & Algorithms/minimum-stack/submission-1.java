class MinStack {

        List<Integer> list;
        int curr = -1;
        List<Integer> minPre;

        public MinStack() {
            list = new ArrayList<>();
            minPre = new ArrayList<>();
        }
        
        public void push(int val) {
            if (list.isEmpty()) {
        list.add(val);
        minPre.add(val);
        } else {
        if (val < minPre.get(curr)) {
            minPre.add(val);
        } else {
            minPre.add(minPre.get(curr));
        }
        list.add(val);
        }
        curr++;
        }
        
        public void pop() {
            list.remove(curr);
        minPre.remove(curr);
        curr--;
        }
        
        public int top() {
            return list.get(curr);
        }
        
        public int getMin() {
            return minPre.get(curr);
        }
}
