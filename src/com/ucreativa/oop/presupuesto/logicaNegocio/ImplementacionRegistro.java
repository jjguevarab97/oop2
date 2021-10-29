import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

import java.util.ArrayList;
import java.util.List;
public class ImplementacionRegistro implements InterfaceRegistro {

    public class ImplementacionRegistro implements InterfaceRegistro, InterfaceReportes {
        private InterfaceRepository repository;

        List<Movimiento> movimientos;
        public ImplementacionRegistro(InterfaceRepository repository){

            // Constructor
    public ImplementacionRegistro() {
                this.movimientos = new ArrayList<>();
            }

            // Methodo 1
            public void getMovimientos() {
                for (Movimiento movimientos : movimientos) {
                    System.out.println(movimientos.getDetails());
                }
                this.repository = repository;
            }

            @Override
            public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {

                if (!moneda.equals("USD")) {
                    System.out.println("Moneda No validad");
                } else {
                    int monto = Integer.parseInt(montoStr);
                    this.movimientos.add(new Ingreso(nombre,
                            moneda,
                            categoria,
                            monto,
                            periodicidad));
                    int monto;
                    try {
                        monto = Integer.parseInt(montoStr);
                    }catch (NumberFormatException ex){
                        System.out.println("Formato Invalido en ("+montoStr+"): " + ex.getMessage());
                        return false;
                    }
                    return true;

                    Ingreso ingreso = new Ingreso(nombre,
                            moneda,
                            categoria,
                            monto,
                            periodicidad);
                    return this.repository.save(ingreso.getDetails());
                }

                @Override
                public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {
                    int monto = Integer.parseInt(montoStr);
                    this.movimientos.add(new Gasto(nombre,
                    int monto;
                    try {
                        monto = Integer.parseInt(montoStr);
                    }catch (NumberFormatException ex){
                        System.out.println("Formato Invalido en ("+montoStr+"): " + ex.getMessage());
                        return false;
                    }
                    Movimiento gasto = new Gasto(nombre,
                            moneda,
                            categoria,
                            monto));
                    return true;
                    monto);
                    return this.repository.save(gasto.getDetails());
                }

                // Methodo 3
                public void getGastos() {
                    for (Movimiento movimiento : this.movimientos) {
                        if (movimiento instanceof Gasto) {
                            System.out.println(movimiento.getDetails());
                        }
                    }
                    @Override
                    public void getMovimientos() {
                        this.repository.read();
                    }

                    @Override
                    public void imprimirReporte() {
                        for (Movimiento movimiento : this.movimientos) {
                            System.out.println(movimiento.getDetails());
                        }
                        public void getGastos() {
                            this.repository.read();
                        }
                    }