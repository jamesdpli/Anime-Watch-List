package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.WatchList;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchListRepository extends JpaRepository<WatchList, Long> {
}
