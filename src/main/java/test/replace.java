package test;

import org.mule.api.MuleEventContext;

public class replace implements org.mule.api.lifecycle.Callable {
		String s1;
		    @Override
		    public Object onCall(MuleEventContext eventContext) throws Exception {
		        String s=eventContext.getMessage().getPayloadAsString();
		        System.out.println(s);
		        
		        if(s.endsWith("set-payload"))
		        {
		        	System.out.println("Executed correctly");
		        	String s1=s.replaceAll("set-payload", "java program");
		        	System.out.println(s1);
		        	return s1;
		        }
		        return s1;
		    }
}
