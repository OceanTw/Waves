package gg.aquatic.waves.fake

import gg.aquatic.waves.chunk.cache.ChunkObject
import gg.aquatic.waves.fake.entity.FakeEntity
import gg.aquatic.waves.fake.block.FakeBlock
import java.util.concurrent.ConcurrentHashMap

class FakeObjectChunkBundle: ChunkObject {

    val blocks = ConcurrentHashMap.newKeySet<FakeBlock>()
    val entities = ConcurrentHashMap.newKeySet<FakeEntity>()

}