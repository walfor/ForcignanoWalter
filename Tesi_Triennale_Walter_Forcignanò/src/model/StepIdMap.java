package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepIdMap {
	// la posizione � una variabile di tipo string che nella tabella � salvata come
	// steplocationList

	private Map<Step, Step> map = new HashMap<Step, Step>();

	public void put(Step Step) {
		this.map.put(Step, Step);
	}

	public Step get(Step step) {
		if (this.map.containsKey(step)) {
			return this.map.get(step);
		}

		this.map.put(step, step);
		return step;
	}

	public Collection<Step> values() {
		// TODO Auto-generated method stub
		List<Step> steps = new ArrayList<>(this.map.values());
		Collections.sort(steps, new Comparator<Step>() {

			@Override
			public int compare(Step a, Step b) {
				// TODO Auto-generated method stub
				return Integer.compare(a.getPercorso_id(), b.getPercorso_id());
			}

		});

		return steps;
	}

	public void remove(Step s) {
		map.remove(s);
	}
}
