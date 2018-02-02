import java.util.ArrayList;

class EjercicioR207{
  public String devolverEnOrden(ArrayList<String> palabras)
  {
    String palabraADevolver = "";
    int palabraLargaMasCercana = -1;
    int letrasPalabraMasLarga = 0;
    for (String listaActual : palabras){
      if(listaActual.length() >= 0) {
        if (listaActual.length() > palabraLargaMasCercana){
          palabraLargaMasCercana = listaActual.length();
          letrasPalabraMasLarga = listaActual.length();
        }                  
      }
    }
    while (letrasPalabraMasLarga > 0){
      for (int i = palabras.size()-1; i>=0; i--){
        if (palabras.get(i).length() == letrasPalabraMasLarga){
          palabraADevolver += palabras.get(i) + ",";
        }
      }
      letrasPalabraMasLarga--;
    }
    if (palabraADevolver != ""){
      palabraADevolver = palabraADevolver.substring(0,palabraADevolver.length()-1);
    }
    return palabraADevolver;  
  }
}