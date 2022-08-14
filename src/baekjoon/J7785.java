package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class J7785 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> set = new HashSet<>();
		
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0 ; i < n ; i++) {
			String[] data = reader.readLine().split(" ");
			String name = data[0];
			String log = data[1];
			
			if ( log.equals("enter") ) {
				set.add(name);
			}
			
			if ( log.equals("leave") ) {
				set.remove(name);
			}
		}
		
		List<String> list = new ArrayList<>();
		Iterator<String> it = set.iterator();
		
		while ( it.hasNext() ) {
			list.add(it.next());
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (String name : list) {
			writer.write(name + "\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
