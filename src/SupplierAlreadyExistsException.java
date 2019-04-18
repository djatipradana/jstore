import java.io.*;

public class SupplierAlreadyExistsException extends Exception{
    private Supplier supplier_error;

    public SupplierAlreadyExistsException(Supplier supplier_input){
        super();
        supplier_error = supplier_input;
    }

    @Override
    public String getMessage(){
        return "Supplier Email: ";
    }

    public String getExMessage(){
        return super.getMessage() + supplier_error.getEmail() + ", or phoneNumber: " + supplier_error.getPhoneNumber()+ " already exists";
    }
}
