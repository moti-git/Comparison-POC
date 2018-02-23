import java.lang.reflect.Field;
import java.util.Map;

import com.spectrum.tos.model.device.Device;


public class ObjectPropertyComparisonUtil {
	
	public static void main(String[] args) {
		Device d1 = new Device();
		Device d2 = new Device();
		d1.setType("Network");
		d2.setType("Network");
		
		System.out.println(getDiffirentComparisionVal(d1,d2));
	}
	/*
	 * 
	 */
	public static Map<String,String> getDiffirentComparisionVal(Device d1, Device d2) {
		
		String []device1Fields = getFields(d1);
		String []device2Fields = getFields(d2);
		
		return null;
		
	}
   
	/*
	 * 
	 */
	public static String[] getFields(Device d1) {
		//Class<? extends ObjectPropertyComparisonUtil> deviceClass = getClass();
		//Field []fields = deviceClass.getFields();
		
		Field []fields = d1.getClass().getDeclaredFields();
		String[] lines = new String[fields.length];

	    int index = 0;
	    for (Field field : fields) {
	        StringBuilder lineBuilder = new StringBuilder();

	        lineBuilder.append(field.getName());

	        field.setAccessible(true);

	        try {
	            Object value = field.get(field);

	            lineBuilder.append(" = ");
	            lineBuilder.append(value);
	        } catch (IllegalAccessException e) {
	            lineBuilder.append(" > ");
	            lineBuilder.append(e.getClass().getSimpleName());
	        }

	        lines[index++] = lineBuilder.toString();
	    }

	    return lines;
	}
	
	/*private String[] getFields() {
	    Class<? extends ObjectPropertyComparisonUtil> componentClass = getClass();
	    Field[] fields = componentClass.getFields();
	    List<String> lines = new ArrayList<>(fields.length);

	    Arrays.stream(fields)
	            .forEach(
	                    field -> {
	                        field.setAccessible(true);
	                        try {
	                            lines.add(field.getName() + " = " + field.get(this));
	                        } catch (final IllegalAccessException e) {
	                            lines.add(field.getName() + " > "
	                                    + e.getClass().getSimpleName());
	                        }
	                    });

	    return lines.toArray(new String[lines.size()]);
	}*/

}
