package bstrom.akim.demoJPA.repository;

import bstrom.akim.demoJPA.entities.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge, Integer> {
}
