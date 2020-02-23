package com.iss.day04;

import java.util.*;




public class CardDemo {



    public static void main(String[] args) {
        {
//            Player p1 = new Player(1,"p1");
//            Player p2 = new Player(2,"p2");
//            Player p3 = new Player(3,"p3");
            Set<Player> playerSet = new TreeSet<Player>();
//            Player p1=  new Player(1,"张建");

            playerSet.add(new Player(1,"张健"));
            playerSet.add(new Player(2,"刘英贤"));
            playerSet.add(new Player(3,"王继豪"));
            playerSet.add(new Player(4,"邴英澳"));

            Player[] players = {new Player(1,"张健"),new Player(2,"刘英贤"),
                    new Player(3,"王继豪")};



            //创建一副纸牌
           Card[] cards = new Card[54];
           Set<Card> cardSet = new TreeSet<Card>();



            int i = 0;

            for(int rank = Card.THREE; rank <= Card.DECUCE;rank++){
                cardSet.add (new Card(Card.HEART,rank));
                cardSet.add (new Card(Card.SPADE,rank));
                cardSet.add (new Card(Card.DIMAOND,rank));
                cardSet.add (new Card(Card.CLUB,rank));
            }
            cardSet.add (new Card(Card.JOKER,Card.BLACK));
            cardSet.add (new Card(Card.JOKER,Card.COLOR));



            for(int rank = Card.THREE; rank <= Card.DECUCE;rank++){
                cards[i++] = (new Card(Card.HEART,rank));
                cards[i++] = (new Card(Card.SPADE,rank));
                cards[i++] = (new Card(Card.DIMAOND,rank));
                cards[i++] = (new Card(Card.CLUB,rank));
            }
            cards[i++] = (new Card(Card.JOKER,Card.BLACK));
            cards[i++] = new Card(Card.JOKER,Card.COLOR);

            System.out.println("新牌："+Arrays.toString(cards));
            System.out.println("新牌："+cardSet.toString());
//            cards.add(new Card(Card.HEART,rank));

            //洗牌，使用Random

//            Collections.shuffle(cardSet);
            Random random = new Random();
            for(i = cardSet.size();i >= 1;i--){
                int j = random.nextInt(i);
                Iterator<Card> it = cardSet.iterator();
                while (it.hasNext()){

                }
//                cardSet.su
            }


            Random r = new Random();
            for(i = cards.length-1;i >= 1;i--){
                int j = r.nextInt(i);
                Card t = cards[j];
                cards[j] = cards[i];
                cards[i] = t;
            }
            System.out.println("洗完之后："+Arrays.toString(cards));

            int j = 0;
            for (i = 0;i < cards.length;i++){
                Card c = cards[i];
                players[j++%players.length].add(c);//这句话的顺序：players[j].add(c);j++;j = j % players.length;
            }
            System.out.println(players[0].toString());
            System.out.println(players[1].toString());
            System.out.println(players[2].toString());


        }
    }
}


class ById implements Comparator<Card> {//自定义比较规则
    public int compare(Player p1, Player p2) {
        return p1.getId() - p2.getId();
    }

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getRank() - o2.getRank();
    }
}