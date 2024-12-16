package com.proyecto.microserviciocultura.service;

import com.proyecto.microserviciocultura.model.EventoCultural;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class EventoService {

    public List<EventoCultural> getEvents() {
        return Arrays.asList(
                new EventoCultural("Talleres:", "Taller de Pintura, Taller de Escultura, Taller de Cerámica, Taller de Fotografía, Taller de Cocina, Taller de Jardinería, Taller de Costura, Taller de Teatro, Taller de Danza, Taller de Música"),
                new EventoCultural("Charlas:", "Charla sobre Historia, Charla sobre Tecnología, Charla sobre Psicología, Charla sobre Medio Ambiente, Charla sobre Salud, Charla sobre Educación, Charla sobre Economía, Charla sobre Política, Charla sobre Filosofía, Charla sobre Arte"),
                new EventoCultural("Libros:", "Don Quijote de la Mancha, Cien Años de Soledad, La Casa de los Espíritus, El Amor en los Tiempos del Cólera, Rayuela, La Sombra del Viento, El Nombre de la Rosa, Crónica de una Muerte Anunciada, La Ciudad y los Perros, La Fiesta del Chivo"),
                new EventoCultural("Conciertos:", "Concierto de Rock, Concierto de Jazz, Concierto de Pop, Concierto de Clásica, Concierto de Flamenco, Concierto de Reggae, Concierto de Bryant Myers, Concierto de Hip-Hop, Concierto de Electrónica, Concierto de Anuel")
        );
    }
}