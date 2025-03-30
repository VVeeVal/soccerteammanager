package com.example.soccerteammanagement;

/**
 * Base interface for soccer entities
 */
public interface SoccerEntity {
    /**
     * Get the unique identifier of the entity
     * @return String identifier
     */
    String getId();

    /**
     * Get the name of the entity
     * @return String name
     */
    String getName();
} 