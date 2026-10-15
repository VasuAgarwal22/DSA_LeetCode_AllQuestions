class Spreadsheet {
    HashMap<String,Integer> map;

    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
         map.put(cell,value);
    }
    
    public void resetCell(String cell) {
        if(map.containsKey(cell)){
            map.put(cell,0);
        }
    }
    public int getValue(String formula) { 
        String [] parts = formula.substring(1).split("\\+");
        int a,b;
        if(Character.isDigit(parts[0].charAt(0))){
            a = Integer.parseInt(parts[0]);
        }else{
            a = map.getOrDefault(parts[0],0);

        }

        if(Character.isDigit(parts[1].charAt(0))){
            b = Integer.parseInt(parts[1]);
        }else{
            b = map.getOrDefault(parts[1],0);
            
        }
        return a+b;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */