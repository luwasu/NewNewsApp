package codes.gorillu.newnewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> theNews) {
        super(context, 0, theNews);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.thumbnail);
        Glide.with(imageView).load(currentNews.getThumbnail()).into(imageView);

        TextView titleView = listItemView.findViewById(R.id.story_title);
        titleView.setText(currentNews.getTitle());

        TextView sectionView = listItemView.findViewById(R.id.section);
        String section = "Category: " + currentNews.getSection();
        sectionView.setText(section);

        TextView dateView = listItemView.findViewById(R.id.date);
        String fullDate = currentNews.getDate();
        String shortDate = fullDate.substring(0, 10);
        if (currentNews.getDate() != null) {
            dateView.setText(shortDate);
        } else {
            dateView.setVisibility(View.GONE);
        }
        TextView authorView = listItemView.findViewById(R.id.author);
        if (currentNews.getAuthor() != null) {
            String author = "By: " + currentNews.getAuthor();
            authorView.setText(author);
        } else {
            authorView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}