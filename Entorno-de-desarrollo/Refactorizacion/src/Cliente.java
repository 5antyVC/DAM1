
public class Cliente {
    
    private String  nombre;
    private double saldo;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private Producto[] productosComprados;

    private int numProductoscomprados;

    public Producto[] getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(Producto[] productosComprados) {
        this.productosComprados = productosComprados;
    }

    public int getNumProductoscomprados() {
        return numProductoscomprados;
    }

    public void setNumProductoscomprados(int numProductoscomprados) {
        this.numProductoscomprados = numProductoscomprados;
    }

    public Cliente(String nombre, double saldo)
    {

        this.nombre=nombre;
        this.saldo=saldo;
        this.productosComprados= new Producto[10];
        this.numProductoscomprados=0;
        
    }

    public void comprarProducto(Producto producto)
    {
        if (saldo >= producto.getValor()) {
            saldo-=producto.getValor();
            productosComprados[numProductoscomprados]=producto;
            numProductoscomprados++;
            System.out.println(nombre+ " ha comprado "+producto.getNombre()+" por un valor de "+producto.getValor());
        }
        else
        {
            System.out.println(nombre+" np tiene suficiente saldo para comprar "+producto.getNombre());
        }
    }







    public static class  Producto{
    private String nombre;
    private double valor;

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public Producto(String nombre, double valor)
    {
        this.nombre=nombre;
        this.valor=valor;
    }
}


public static class Main{
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("Juan",100.0);
        Producto producto1=new Producto("Camisa",50.0);
        Producto producto2=new Producto("Pantalon",75.0);

        cliente1.comprarProducto(producto1);
        cliente1.comprarProducto(producto2);

        System.out.println(cliente1.getNombre()+" ha comprado los siguientes productos: ");


        for (int i = 0; i < cliente1.getNumProductoscomprados(); i++) {
            System.out.println(cliente1.getProductosComprados()[i].getNombre());
        }
    }

}
}