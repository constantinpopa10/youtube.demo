package dessignPatterns.composite.headfirst;

import java.util.Iterator;
import java.util.Stack;

@SuppressWarnings("rawtypes")
public class CompositeIterator implements Iterator {

	Stack<Iterator> stack = new Stack<Iterator>();

	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if(component instanceof Menu){
				stack.push(((Menu) component).createIterator());
			}
			return component;			
		}else{
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
