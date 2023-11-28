public class NewsSubscriptionApp {
        public static void main (String[]args){

            NewsAgency newsAgency = new NewsAgency();


            Subscriber subscriber1 = new Subscriber("Troy");
            Subscriber subscriber2 = new Subscriber("Pardillo");


            newsAgency.subscribe(subscriber1);
            newsAgency.subscribe(subscriber2);
            System.out.println();
            System.out.println("Breaking News: Powerful Solar Flare Threatens Earth");
            newsAgency.publishNews("A massive X-class solar flare has erupted from the Sun, sending a surge of charged particles hurtling toward Earth.\nScientists warn of potential disruptions to communication systems, satellites, and power grids.\n" +

                    "Emergency response teams are on alert, and airlines are adjusting routes to avoid heightened radiation in polar regions.\nWhile the solar storm promises stunning auroras, it also poses risks to our technological infrastructure.\n" +

                    "Stay tuned for updates as scientists closely monitor the situation and assess the impact of this extraordinary cosmic event.\n");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
            newsAgency.unsubscribe(subscriber2);
            System.out.println();

            System.out.println("Breaking News: Potential Global Disease Cure Discovered");
            newsAgency.publishNews("Scientists unveil a groundbreaking treatment with high efficacy in early trials, offering hope for a cure to a widespread infectious disease.\nGovernments and health organizations mobilize for accelerated testing and distribution. Stay tuned for updates on this promising breakthrough.");

        }
    }
