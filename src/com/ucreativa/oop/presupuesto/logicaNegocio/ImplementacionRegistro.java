import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ImplementacionRegistro implements InterfaceRegistro {

    private InterfaceRepository repository;
    @@ -15,13 +18,12 @@ public ImplementacionRegistro(InterfaceRepository repository){
    }

    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {
        public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData {
            int monto;
            try {
                monto = Integer.parseInt(montoStr);
            }catch (NumberFormatException ex){
                System.out.println("Formato Invalido en ("+montoStr+"): " + ex.getMessage());
                return false;
                throw new FormatoInvalido(montoStr, ex.getMessage());
            }

            Ingreso ingreso = new Ingreso(nombre,
            @@ -33,7 +35,7 @@ public boolean addIngreso(String nombre, String moneda, String categoria, String
        }

        @Override
        public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {
            public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData
            {
                int monto;
                try {
                    monto = Integer.parseInt(montoStr);
                } catch (NumberFormatException ex) {
                    System.out.println("Formato Invalido en (" + montoStr + "): " + ex.getMessage());
                    return false;
                }
                Movimiento gasto = new Gasto(nombre,
                        moneda,
                        categoria,
                        monto);
                return this.repository.save(gasto.getDetails());
            }
        }