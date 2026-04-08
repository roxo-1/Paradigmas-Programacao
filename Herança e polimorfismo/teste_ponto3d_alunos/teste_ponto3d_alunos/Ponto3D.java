class Ponto3D extends Ponto2D{
    private double x,y,z;
    //construtor que inicializa
    public Ponto3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public Ponto3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z; 
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
    
    public double getZ(){
        return this.z;
    }
    
    public boolean equals(Object obj){
        Ponto3D outro = (Ponto3D) obj;
        return Double.compare(this.x, outro.getX()) == 0 && Double.compare(this.y, outro.getY()) == 0 && Double.compare(this.z, outro.getZ()) == 0;   
    }

    public String toString() {
        // O teste exige "(10.0,20.0)" -> Sem espaços!
        return "(" + this.x + "," + this.y + ","+ this.z+")";
    }
}