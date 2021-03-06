package asquero.com.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ModelList>list;
    private Context context;

    public MyAdapter(List<ModelList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelList listItem = list.get(position);

        holder.Topic.setText(listItem.getTopic());
        holder.endDate.setText(""+(listItem.getStartDate()));
        holder.startDate.setText(""+(listItem.getEndDate()));
        holder.endTime.setText(""+(listItem.getStartTime()));
        holder.startTime.setText(""+(listItem.getEndTime()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView Topic;
        public TextView endDate;
        public TextView startDate;
        public TextView endTime;
        public TextView startTime;

        public ViewHolder(View itemView) {
            super(itemView);

            Topic = (TextView)itemView.findViewById(R.id.topic);
            endDate = (TextView)itemView.findViewById(R.id.startDateNum);
            startDate = (TextView)itemView.findViewById(R.id.endDateNum);
            endTime = (TextView)itemView.findViewById(R.id.startTimeNum);
            startTime = (TextView)itemView.findViewById(R.id.endTimeNum);
        }
    }
}
