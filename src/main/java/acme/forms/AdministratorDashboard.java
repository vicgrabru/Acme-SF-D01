
package acme.forms;

import java.util.Map;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Map<String, Integer>		numberOfPrincipalsByRole;
	Double						ratioOfNoticesWithEmailAdressAndLink;
	Double						ratioOfCriticalObjectives;
	Double						ratioOfNonCriticalObjectives;

	Double						avgRiskValue;
	Double						minRiskValue;
	Double						maxRiskValue;
	Double						stdRiskValue;

	Double						avgNumberOfClaims;
	Double						minNumberOfClaims;
	Double						maxNumberOfClaims;
	Double						stdNumberOfClaims;

}
