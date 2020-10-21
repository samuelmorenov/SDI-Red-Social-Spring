package com.uniovi.tests.ejercicios;

import org.junit.Test;

import com.uniovi.services.data.UserList;
import com.uniovi.tests.pageobjects.PO_HomeView;
import com.uniovi.tests.pageobjects.PO_Invitation;
import com.uniovi.tests.pageobjects.PO_LoginView;
import com.uniovi.tests.pageobjects.PO_PrivateView;

public class Ejercicio08_Tests extends ClasePadre {
	/**
	 * Sobre el listado de invitaciones recibidas. Hacer click en el botón/enlace de
	 * una de ellas y comprobar que dicha solicitud desaparece del listado de
	 * invitaciones.
	 */
	@Test
	public void E08_Prueba_18() {
		PO_Invitation.enviarPeticiones(driver);
		PO_HomeView.clickOption(driver, "login", "class", "btn btn-primary");
		PO_LoginView.fillForm(driver, UserList.usuariosTest(1).email, UserList.usuariosTest(1).password);
		PO_PrivateView.accederPagina(driver, "friends-menu", "/friend/invitationlist");
	}
}
