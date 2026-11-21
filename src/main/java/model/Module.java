package model;

public class Module {
}
 private String result;
    private String name;
    private String code;
    
    public Module(String code, String name, String result){
        this.code = code;
        this.name = name;
    }
    
    public void setResult(){
        
        boolean valid = false;
        
        while(!valid){
        try{
            Grade grade = Grade.valueOf(result.toUpperCase());
            this.result = result;
            valid = true;
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid input for result.");
        }
    }
}
