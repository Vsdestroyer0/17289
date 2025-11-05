// importación de paquetes propios
package mx.uv.listi._9.Saludar;

// importación de paquetes externos
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
// declaración de la clase
@Controller
public class SaludarPlantilla {

        @GetMapping("/plantilla")
        public String plantilla1(Model model){
            model.addAttribute("Persona", "Yo");
            return "planti";
        }

        @GetMapping("/plantilla/{nombre}")
        public String plantilla(@PathVariable (name = "nombre") String nombre, Model m){
            m.addAttribute("Persona", nombre);
            return "planti";
        }
}
