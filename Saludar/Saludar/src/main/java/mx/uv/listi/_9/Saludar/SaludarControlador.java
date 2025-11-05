// Paquete del proyecto
package mx.uv.listi._9.Saludar;

// Importaciones
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

// Clase controlador 
@RestController
@CrossOrigin(origins = "*")
public class SaludarControlador {

    saludador s;

    // EndPoint para altas, bajas, cambios y consultas
    @RequestMapping("/")
    public String home(){
        return "<ul><li><a href='/altas'>Altas</a></li> <li><a href='/bajas'>Bajas</a></li> <li><a href='/cambios'>Cambios</a></li> <li><a href='/consultas'>Consultas</a></li></ul>";
    }

    @RequestMapping(value = "/altas")
    public String altas(){
        return "altas";
    }

    @RequestMapping(value = "/bajas")
    public String bajas(){
        return "bajas";
    }
    
    @RequestMapping(value = "/cambios")
    public String cambios(){
        return "cambios";
    }

    @RequestMapping(value = "/consultas")
    public String consultas(){
        return "consultas";
    }
    
    //Endpoints para saludar
    @RequestMapping(value ={ "/saludar1", "/saludar1/{nombre}"}, method = RequestMethod.GET)
    public saludador saludarPath1(@PathVariable (required = false) String nombre){
        if (nombre != null){
            return new saludador(nombre);
        } 
        else {
            return new saludador("Valor default");
        }
    }

    // Metodos adecuados a REST
    @RequestMapping(value = "/Saludar", method = RequestMethod.POST)
    public String altasRest(){
        return "altasRest";
    }

    @RequestMapping(value = "/Saludar", method = RequestMethod.DELETE)
    public String bajasRest(){
        return "bajasRest";
    }

    @RequestMapping(value = "/Saludar", method = RequestMethod.PUT)
    public String cambiosRest(){
        return "cambiosRest";
    }

    @RequestMapping(value = "/Saludar", method = RequestMethod.GET)
    public String consultasRest(){
        return "consultasRest";
    }

    @RequestMapping(value = "/error", method=RequestMethod.GET)
    public String errorRest(){
        return "error Rest";
    }

    // Request Params de query String
    
    @GetMapping("/query")
    public String saludarQuery(@RequestParam String nombre){
        System.out.println(nombre);
        return nombre;
    }

    // Recepción de parámetros estructurados
    @PostMapping("/crearSaludo")
    public String SaludoCrear(@RequestBody  saludador parametro){
        s = parametro;
        System.out.println(parametro.getContenido());
        return "éxito";
    }

    @GetMapping("/obtenerSaludo")
    public saludador obtenerSaludo(){
        return s;
        }
}

