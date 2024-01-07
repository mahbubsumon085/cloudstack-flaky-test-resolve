package com.cloud.server;

import java.lang.reflect.Type;

import com.cloud.agent.api.VmStatsEntryBase;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class VmStatsEntryBaseJsonSerializer implements JsonSerializer{


    @Override
    public JsonElement serialize(Object src, Type typeOfSrc, JsonSerializationContext context) {
        // TODO Auto-generated method stub
        VmStatsEntryBase vmobject = (VmStatsEntryBase) src;
        JsonObject object = new JsonObject();
        object.add("vmId", context.serialize(vmobject.getVmId()));
        object.add("cpuUtilization", context.serialize(vmobject.getCPUUtilization()));
        object.add("networkReadKBs", context.serialize(vmobject.getNetworkReadKBs()));
        object.add("networkWriteKBs", context.serialize(vmobject.getNetworkWriteKBs()));
        object.add("diskReadIOs", context.serialize(vmobject.getDiskReadIOs()));
        object.add("diskWriteIOs", context.serialize(vmobject.getDiskWriteIOs()));
        object.add("diskReadKBs", context.serialize(vmobject.getDiskReadKBs()));
        object.add("diskWriteKBs", context.serialize(vmobject.getDiskWriteKBs()));
        object.add("memoryKBs", context.serialize(vmobject.getMemoryKBs()));
        object.add("intFreeMemoryKBs", context.serialize(vmobject.getIntFreeMemoryKBs()));
        object.add("targetMemoryKBs", context.serialize(vmobject.getTargetMemoryKBs()));
        object.add("numCPUs", context.serialize(vmobject.getNumCPUs()));
        object.add("entityType", context.serialize(vmobject.getEntityType()));
        return object;
   }
}