java.util.TimeZone.getAvailableIDs.map(a => a.split("/")).filter(_.length>1).map(a => a(1)).grouped(10).map(a => a(0)).toArray
