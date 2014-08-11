package dessignPatterns.composite.headfirst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	Iterator iterator;
	
	public Iterator createIterator(){
		if(iterator==null){
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	
	public void print(){
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("------------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		
		while(iterator.hasNext()){
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
		
	}
}
