package pt.ulisboa.tecnico.sirs.mdrecords;

import pt.ulisboa.tecnico.sirs.mdrecords.personal.*;

import java.security.Key;

public class MDRecordsApp{

    private static SNS sns;
    public static void main(String[] args) throws Exception {

        String uddiURL = null;
        String wsName = null;
        String wsURL = null;

        Doctor doctor = new Doctor("Vítor Nunes", 123456789);
    }
    public MDRecordsApp(){
        sns = SNS.getInstance();
    }

    private MDRecordsPortType portType;


    public boolean authenticateUser(Key key, long id){
        return true;
    }



}
