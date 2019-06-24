package Q1Q2;

public abstract class  Ave extends Animal {
    
    private boolean voa;
    
    public Ave(String n,boolean v) {
        super(n);
        setVoa(v);
    }
    public boolean getVoa(){
        return this.voa;
    }
    public void setVoa(boolean v){
        this.voa=v;
    }
    public abstract void talk();
            }
