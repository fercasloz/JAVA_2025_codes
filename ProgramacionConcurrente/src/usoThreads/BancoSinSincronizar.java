package usoThreads;

public class BancoSinSincronizar {
    public static void main(String[] args) {
        
        Banco b = new Banco();

        for(int i=0; i<100; i++){
            EjecuccionTransferencias r = new EjecuccionTransferencias(b, i, 2000);
            Thread t = new Thread(r);
            t.start();
        }

    }
}

class Banco{
    
    public Banco(){
        cuentas = new double[100]; // cada cuenta esta identificada con su valor de array
        for (int i = 0; i<cuentas.length;i++){
            cuentas[i] = 2000;
        }
    }

    public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad){
        if(cuentas[cuentaOrigen]<cantidad){ //evalua que el saldo no es inferior a la transferencia
            return; // para que no haga nada
        }
        System.out.println(Thread.currentThread()); //para ver el hilo que ha hecho la transferencia

        cuentas[cuentaOrigen] -= cantidad; //descontamos del saldo la cantidad de la transferencia

        System.out.printf("%10.2f de %d para %d ", cantidad, cuentaOrigen, cuentaDestino);

        cuentas[cuentaDestino] += cantidad;

        System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
    }

    public double getSaldoTotal(){
        double sumaCuentas=0;
        for (double cuenta: cuentas){
            sumaCuentas += cuenta;
        }

        return sumaCuentas;
    }

    private final double[] cuentas;
}

class EjecuccionTransferencias implements Runnable{

    public EjecuccionTransferencias(Banco b, int de, double max){
        banco=b;
        deLaCuenta=de;
        cantidadMax=max;
    }

    @Override
    public void run() {
        try{
            while(true){//bucle infinito
                int paraLaCuenta = (int)(Math.random()*100);
                double cantidad = cantidadMax*Math.random(); // cantidad maxima es 2000 , la transferencia es aleatoria
                //llamamos al metodo transferencia
                banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);

                Thread.sleep((int)(Math.random()*10000));
             }
        }catch(InterruptedException e){
            e.getStackTrace();
        }
            
        
    }

    private Banco banco;
    private int deLaCuenta;
    private double cantidadMax;

}