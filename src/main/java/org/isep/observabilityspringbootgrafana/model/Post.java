package org.isep.observabilityspringbootgrafana.model;

public record Post(Integer id, Integer userId, String title, String body) {
}
