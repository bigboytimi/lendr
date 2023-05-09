package org.application.lendr.domain.model;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public final class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String occupation;
}
