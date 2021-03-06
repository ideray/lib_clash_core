// Code generated by gobind. DO NOT EDIT.

// Java class bridge.EventPoll is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/kr328/cfa/bridge
package bridge;

import go.Seq;

public final class EventPoll implements Seq.Proxy {
	static { Bridge.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	EventPoll(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public EventPoll() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	public native void stop();
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof EventPoll)) {
		    return false;
		}
		EventPoll that = (EventPoll)o;
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("EventPoll").append("{");
		return b.append("}").toString();
	}
}

