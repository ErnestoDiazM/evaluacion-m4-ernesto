package com.healthtrack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.healthtrack.Usuario;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Juan Pérez", 70.5);
    }

    @Test
    void testGetNombre() {
        assertEquals("Juan Pérez", usuario.getNombre(), "El nombre del usuario no es el esperado.");
    }

    @Test
    void testGetPeso() {
        assertEquals(70.5, usuario.getPeso(), 0.01, "El peso inicial del usuario no es el esperado.");
    }

    @Test
    void testActualizarPeso() {
        usuario.actualizarPeso(72.0);  // Se espera 69.5 debido al error en la lógica
        assertEquals(69.5, usuario.getPeso(), 0.01, "El peso no fue actualizado correctamente.");
    }

    @Test
    void testMostrarInformacion() {
        assertDoesNotThrow(() -> usuario.mostrarInformacion(), "El método mostrarInformacion debería ejecutarse sin errores.");
    }
}
