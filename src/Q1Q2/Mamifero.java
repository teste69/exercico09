package Q1Q2;

public abstract class Mamifero extends Animal{
    
    private int patas;
    
    public Mamifero(String n,int p) {
        super(n);
        setPatas(p);
    }
    public int getPatas(){
        return this.patas;
    }
    public void setPatas(int p){
        this.patas=p;
    }
    
    
}
