package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.passive.EntityNameTag;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.NameTag;
import org.bukkit.entity.EntityType;

public class CraftNameTag extends CraftAmbient implements NameTag {
    public CraftNameTag(CraftServer server, EntityNameTag entity) {
        super(server, entity);
    }

    @Override
    public EntityNameTag getHandle() {
        return (EntityNameTag) entity;
    }

    @Override
    public String toString() {
        return "CraftNameTag";
    }

    public EntityType getType() {
        return EntityType.ENTITY_NAMETAG;
    }
}
