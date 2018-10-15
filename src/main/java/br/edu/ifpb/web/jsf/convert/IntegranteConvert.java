package br.edu.ifpb.web.jsf.convert;

import br.edu.ifpb.domain.model.banda.Bandas;
import br.edu.ifpb.domain.model.banda.Integrante;
import br.edu.ifpb.domain.model.banda.ServiceBanda;
import br.edu.ifpb.infra.persistence.jdbc.BandasEmJDBC;
import br.edu.ifpb.infra.persistence.memory.BandasEmMemoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/11/2017, 18:53:05
 */
@FacesConverter(value = "convert.Integrante", forClass = Integrante.class)
public class IntegranteConvert implements Converter {

  //  private final Bandas albuns = new BandasEmMemoria();
     private final ServiceBanda serviceBanda = new ServiceBanda();
    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {
        if (value == null) {
            return null;
        }
        return serviceBanda.localizarIntegrantePor(value); 
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        if (value == null) {
            return null;
        }
        Integrante integrante = (Integrante) value;
        return integrante.getNome();
    }

}
