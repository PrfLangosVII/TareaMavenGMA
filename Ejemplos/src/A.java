public class A {
	private int atributoA;
	public void  metodoA() {
		System.out.println("Método A");
	}
}

class B extends A {
	private int atrobutoB;
	public void metodoB() {
		System.out.println("Método B");
	}
}

class C extends B {
    private int atributoC;
    public void metodoC() {
    	System.out.println("Método C");
    }
}

class D extends B {
    private int atributoD;
    public void metodoD() {
    	System.out.println("Método D");
    }
}