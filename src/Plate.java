public class Plate {
    private int plateLength=7;
    private String plate;

    public Plate(String userPlate){
        plate=userPlate;
        //verifyPlate();
    }
    //Check Plate follows ABC0123
    public boolean  verifyPlate(){

        if(plate.matches("[a-zA-Z]{3}[0-9]{4}")){

            return true;
        }
        return false;
    }

    public int lastDigit(){

        return Character.getNumericValue(plate.charAt(plateLength - 1));

    }
}
