class Alpha {
    int a;
    int b;
    String name;

    // Constructor with one parameter
    public Alpha(String name)
	{
        this.name=name;
    }

    // Constructor with three parameters
    public Alpha(String name, int a, int b)
	{
        this.name = name;
        this.a = a;
       this.b = b;
    }

    
    void method(int a, int b) 
	{
        System.out.println("Sum: " + (a + b));
    }

    // Method that returns the current object
    Alpha method6(Alpha n)
	{
        return this;
    }

    
    void methods() {
        display(this);
    }

   
    void display(Alpha obj) {
        System.out.println("Name: " + obj.name);
        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
  
    }

    
    public static void main(String[] args) {
        Alpha n = new Alpha("People",7,8);
        n.method(6, 7);

        // Passing an object to method6
        Alpha result = n.method6(n);
        result.methods(); 
    }
}
