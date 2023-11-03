package io.github.kbuntrock.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TagTest {
    @SuppressWarnings("EqualsWithItself")
    @Test
    public void testCompareTo() {
        // Create some sample Tag objects for testing
        Tag tag1 = tag("Tag 1");
        Tag tag2 = tag("Tag 2");
        Tag tag3 = tag("Tag 3");

        // Compare tag1 and tag2 by computedName
        assertThat(tag1.compareTo(tag2)).isLessThan(0);

        // Compare tag2 and tag1 (reverse order)
        assertThat(tag2.compareTo(tag1)).isGreaterThan(0);

        // Compare tag1 and tag3 by computedName
        assertThat(tag1.compareTo(tag3)).isLessThan(0);

        // Compare tag2 and tag3 by computedName
        assertThat(tag2.compareTo(tag3)).isLessThan(0);

        // Compare tag1 and tag2 by name (computedName is the same)
        assertThat(tag1.compareTo(tag2)).isLessThan(0);

        // Compare tag2 and tag1 by name (computedName is the same, reverse order)
        assertThat(tag2.compareTo(tag1)).isGreaterThan(0);

        // Compare tag1 and tag3 by name (computedName is the same)
        assertThat(tag1.compareTo(tag3)).isLessThan(0);

        // Compare tag2 and tag3 by name (computedName is the same)
        assertThat(tag2.compareTo(tag3)).isLessThan(0);

        // Compare tag3 and tag3 (should be equal)
        assertThat(tag3.compareTo(tag3)).isZero();
    }

    private Tag tag(String name) {
        Tag tag = new Tag(String.class);
        tag.setName(name);
        return tag;
    }
}
